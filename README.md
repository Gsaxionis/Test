# Functional automated E2E tests for EUDI Wallet

## Table of contents

* [Overview](#overview)
* [Disclaimer](#disclaimer)
* [Requirements](#requirements)
* [Installation](#installation)
* [Demo applications](#demo-applications)
* [Running the tests](#running-the-tests)
* [Running the tests through Github Actions](#running-the-tests-through-github-actions)
* [Demo video](#demo-video)
* [Implemented test cases](#implemented-test-cases)
* [How to contribute](#how-to-contribute)
* [License](#license)
    + [License details](#license-details)


## Overview
Following below instructions, automated tests can be executed locally or via Github actions and test results will be generated.

## Disclaimer
The released software is a initial development release version:
-  The initial development release is an early endeavor reflecting the efforts of a short timeboxed period, and by no means can be considered as the final product.
-  The initial development release may be changed substantially over time, might introduce new features but also may change or remove existing ones, potentially breaking compatibility with your existing code.
-  The initial development release is limited in functional scope.
-  The initial development release may contain errors or design flaws and other problems that could cause system or other failures and data loss.
-  The initial development release has reduced security, privacy, availability, and reliability standards relative to future releases. This could make the software slower, less reliable, or more vulnerable to attacks than mature software.
-  The initial development release is not yet comprehensively documented.
-  Users of the software must perform sufficient engineering and additional testing in order to properly evaluate their application and determine whether any of the open-sourced components is suitable for use in that application.
-  We strongly recommend to not put this version of the software into production use.
-  Only the latest version of the software will be supported

## Requirements

- Maven 3.5 or newer
- Java 17
- Appium
- Android Studio

---

Automated tests support Android API 33 (Tiramisu) SDK and above.

## Installation

First of all install the bellow:

### 1. Appium Desktop - Appium Server and Inspector in Desktop GUIs with below settings.

Download appium. When installation finished, double-click the appium icon and open the appium server. Let’s click the “Advanced” tab and change the Server Address to “127.0.0.1” and click Allow Session Override for override session when there will be problems and click “Start Server”.

![Screenshot_63](https://github.com/niscy-eudiw/eudi-automated-tests/assets/138104891/800db70f-7b58-4719-9d3f-055eec7dbbb8)

Set Android and JAVA home in Appium Desktop and then click save and start.

![Screenshot_67](https://github.com/niscy-eudiw/eudi-automated-tests/assets/138104891/2d2527cf-8fcf-48db-b3cc-841755319c33)

After all you will see the server up and running.

![Screenshot_68](https://github.com/niscy-eudiw/eudi-automated-tests/assets/138104891/b9f9b40c-2850-4074-8817-8eb7d76c7558)

### 3. Android Studio and create device: Pixel_6_API_33_1

![Screenshot_65](https://github.com/niscy-eudiw/eudi-automated-tests/assets/138104891/6bad47e6-8c11-483f-a56e-20991599bf83)

## Demo applications

Use the link below to download and install the EUDI Holder and EUDI Verifier app:

- [ ] [EUDI Holder App - EUDI Verifier App](https://install.appcenter.ms/apps)
  This is an external link to AppCenter.

You can install them with drag and drop inside the device that created before on android studio or let automated tests install them automatically.

## Running the tests

1. Clone the repo

```
git clone https://github.com/niscy-eudiw/eudi-automated-tests.git
```

2. Open appium and android studio with device that created before.

3. To run all your tests simply you need to execute the following command

```
mvn verify
```

To run each feuture separately execute the following commands:

API TESTS:

```
mvn verify -Dcucumber.filter.tags='@API'
```

WEB TESTS:

```
mvn verify -Dcucumber.filter.tags='@WEB'
```

UI TESTS:

```
mvn verify --file pom.xml -Dappium.hub=http://127.0.0.1:4723/wd/hub -Dwebdriver.driver=appium -Dappium.platformName=Android -Dappium.deviceName="Pixel_6_API_33_1" -Dcucumber.filter.tags='@UI'
```

## Running the tests through Github Actions

Run automatically tests through GitHub Actions (CI/CD) platform .

There are three different worklflows that build and run automatically every pull request to repository:

- API Workflow
- UI Workflow
- WEB Workflow


## Demo Video

- UI:
  ![EUDI Wallet](https://github.com/niscy-eudiw/eudi-automated-tests/assets/133885795/957bd57c-fe93-4c3d-8179-fd1da4f0445a)

- API:
  ![Animation1](https://github.com/niscy-eudiw/eudi-automated-tests/assets/138104891/79277b6d-1102-4397-b89e-71b4b1b8e572)

- WEB:
  ![Animation2](https://github.com/niscy-eudiw/eudi-automated-tests/assets/138104891/526cf984-8370-4bc0-b9b9-11bf77913443)



## Implemented test cases
The implemented test cases can be found in [feature files](https://github.com/niscy-eudiw/eudi-automated-tests/tree/main/src/test/resources/features).


## How to contribute

We welcome contributions to this project. To ensure that the process is smooth for everyone
involved, follow the guidelines found in [CONTRIBUTING.md](CONTRIBUTING.md).


distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expres## License

## License
### License details

Copyright (c) 2023 European Commission

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, softwares or implied.
See the License for the specific language governing permissions and
limitations under the License.
