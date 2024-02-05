--Suman Kumar 
<img width="960" alt="Screenshot 2024-02-06 003704" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/63f4722c-d34a-4a46-9bb3-5c8ff7195a6c">
<img width="960" alt="Screenshot 2024-02-06 004022" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/0eec5344-55b0-49aa-a11b-3a407fc20c1c">
<img width="960" alt="Screenshot 2024-02-06 004412" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/bc0d5362-ca97-4159-bc43-0ff332efa31b">
<img width="960" alt="Screenshot 2024-02-06 004501" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/846b3240-a5d0-46b4-a18f-e0399f7549f4">
<img width="960" alt="Screenshot 2024-02-06 050125" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/f6db258b-3b5a-4674-9cf8-8919d3abeec8">
<img width="960" alt="Screenshot 2024-02-06 050252" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/3f05d4fd-21a6-40de-928d-657180b49f45">
<img width="902" alt="Screenshot 2024-02-06 050323" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/fd3a595d-e29e-4471-8bd4-4f0ea06ea36f">
<img width="953" alt="Screenshot 2024-02-06 050442" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/cfdd1328-ab33-43ae-9800-641fc166e3eb">
<img width="960" alt="Screenshot 2024-02-06 050834" src="https://github.com/GAUTAMJBITS/Midas-lab-Code-assesment/assets/110326087/7d4d8185-65d2-4e1b-886e-ffce3882cda8">

# Getting Started

**IMPORTANT: Do not send pull requests to this repository. This is a template repository and is not used for grading. Any pull requests will be closed and ignored.**

## Introduction

If you are reading this, you are probably have received this project as a coding challenge. Please read the instructions
carefully and follow the steps below to get started.

## Setup

### Pre-requisities

To run the application you would require:

- [Java](https://www.azul.com/downloads/#zulu)
- [Temporal](https://docs.temporal.io/cli#install)
- [Docker](https://docs.docker.com/get-docker/)
- [Stripe API Keys](https://stripe.com/docs/keys)

### On macOS:

First, you need to install Java 21 or later. You can download it from [Azul](https://www.azul.com/downloads/#zulu) or
use [SDKMAN](https://sdkman.io/).

```sh
brew install --cask zulu21
```

You can install Temporal using Homebrew

```sh
brew install temporal
```

or visit [Temporal Installation](https://docs.temporal.io/cli#install) for more information.

You can install Docker using Homebrew

```sh
brew install docker
```

or visit [Docker Installation](https://docs.docker.com/get-docker/) for more information.

### Other platforms

Please check the official documentation for the installation of Java, Temporal, and Docker for your platform.

### Stripe API Keys

Sign up for a Stripe account and get your API keys from the [Stripe Dashboard](https://dashboard.stripe.com/apikeys).
Then in `application.properties` file add the following line with your secret key.

```properties
stripe.api-key=sk_test_51J3j
```

## Run

You are required to first start the temporal server using the following command

```sh
temporal server start-dev
```

and then run the application using the following command or using your IDE.

```sh
./gradlew bootRun
```

### Other commands

#### Lint
To run lint checks, use the following command

```sh
./gradlew sonarlintMain
```

#### Code Formatting
To format the code, use the following command

```sh
./gradlew spotlessApply
```

## Guides

The following guides illustrate how to use some features concretely:

- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Temporal Quick Start](https://docs.temporal.io/docs/quick-start)
- [Temporal Java SDK Quick Guide](https://docs.temporal.io/dev-guide/java)
- [Stripe Quick Start](https://stripe.com/docs/quickstart)
- [Stripe Java SDK](https://stripe.com/docs/api/java)

### Docker Compose support



This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

- postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)

Please review the tags of the used images and set them to the same as you're running in production.


