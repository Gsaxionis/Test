call mvn clean verify -Dcucumber.filter.tags="@WEB" %*
call mvn serenity:aggregate