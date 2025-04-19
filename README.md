# 🧩 DependencyInjection-Hilt Android Example  

This is a simple Android project that demonstrates how to implement **Dependency Injection** using **Dagger Hilt**, a library built on top of Dagger to simplify DI in Android applications.

The example follows modern Android development practices with **Kotlin** and uses Hilt as the primary dependency injection framework to promote clean architecture, reduce boilerplate, and improve testability.

This project is a practical companion to my Medium article:

📖 **[From Cat to Code: A Gentle Guide to Dependency Injection with Hilt](https://guilhermevcs.medium.com/from-cat-to-code-a-gentle-guide-to-dependency-injection-with-hilt-6290205a1315)**

## 📌 About the Project  
This project shows how to use **Dagger Hilt** to inject dependencies in Android components like Activities and ViewModels, minimizing boilerplate and improving testability.

It covers the essential DI setup:

- `@Inject` – injects dependencies via constructor or field  
- `@Module` and `@Provides` – defines how to create instances  
- `@HiltAndroidApp` – initializes Hilt in the Application class  
- `@AndroidEntryPoint` – allows Android classes to receive injections  
- Field injection
- Named injections for different implementations of the same interface

The example includes a simple use case with a `Veterinarian` class that depends on an `Animal` interface. You’ll see how to inject a `Cat` or `Dog` implementation using Hilt.

## 🧱 Tech Stack  
- Kotlin  
- Dagger Hilt (version 2.56.1)  
- Kotlin Symbol Processing (KSP)  
- Application class setup for DI

## 🚀 Features  
- Basic DI setup with constructor and field injection  
- Hilt modules for dependency provisioning  
- Named bindings for multiple implementations  
- Integration with Android components  
- Clean architecture-ready structure
