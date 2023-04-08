# azure-spring-boot

Basic spring boot app to demonstrate deployment in Azure Web Services using GitHub actions.

The Spring Boot 3.x app does not receive requests with default version of App Insights as of early April 2023

To switch to newer version of AppInsights
1. deploy new jar as static app
```
az webapp deploy --src-path applicationinsights-agent-3.4.11.jar --target-path java/applicationinsights-agent-3.4.11.jar --type static --resource-group rg1 --name azure-spring-boot
```
2. Turn off "Application Insights" - this removes JAVA_TOOL_OPTIONS reference to default agent

3. In "Configuration" add "Application Setting" with custom reference to the deployed newer version of java agent
```
JAVA_TOOL_OPTIONS=-javaagent:/home/site/wwwroot/java/applicationinsights-agent-3.4.11.jar
```

## Running with default Application Insights agent

1. Spring boot 2.7.7

```
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.7.7</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
```

2. OpenAPI docs 1.7.0
```
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-ui</artifactId>
        <version>1.7.0</version>
    </dependency>
```