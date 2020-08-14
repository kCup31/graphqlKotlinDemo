# graphqlKotlinDemo
Graphql demo using Kotlin
# GraphQL Service Using Kotlin

### Dependies required : 

* Spring boot supported [graphql-spring-boot-starter](https://github.com/graphql-java-kickstart/graphql-spring-boot)
* graphql-java-tools : allows us to write graphQL schema files and then connect to java class
* graphiql-spring-boot-starter

The most important classes in GraphQL Java tools to remember are:

* GraphQLQueryResolver – classes implementing this interface are responsible for the root query fields
* GraphQLMutationResolver – classes implementing this interface are responsible for the root mutation fields
* GraphQLResolver – classes implementing this interface are responsible for resolving complex fields on a specific type


### How to run 

http://localhost:8080/graphiql?

When you run the following queries:

```
{
  getAuthorById(id: "1") {
    name
  }
  
  getAuthorBooks(id: "1") {
    		name
    		category
  	
  }
}
```

This will return the following result:

```
{
  "data": {
    "getAuthorById": {
      "name": "Dan Brown"
    },
    "getAuthorBooks": [
      {
        "name": "Da Vinci Code",
        "category": "FICTION"
      },
      {
        "name": "The Lost Symbol",
        "category": "FICTION"
      }
    ]
  }
}

```