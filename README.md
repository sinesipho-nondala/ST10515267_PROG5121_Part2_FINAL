#ST10515267 - PROG5121 Part2: Chat App
- Student name: Sinesipho
- Studnet lastname: Nondala
- Module: Programming 
---
## Features
- User Login & Registration
- Send Message 
- Disregard Message
- Store Message
- Unit Tests: LoginTest, MessageTest
- Github Actions
  ## Project Structure
  ### Message:
  - feat: Set up ChatApp Maven project with JUnit and org.json dependencies and pom.xml with dependencies
  ### Description:
  - Created base project structure, added required libaries: JUnit 4.13.2, org.json, Hamcrest. configured pom.xml for Maven build.
    ## Message class
    ### Message:
    - Feat: Add Message class with ID generation, hash creation, and send options
      ### Description:
    - Implemented unique Message ID, SHA-256 hash generation for every message. Display format: ID | Hash| Recipient| Text. Send logic fully working.
## JSON Storage
### Message:
- Feat: Add JSON file storage and storeMessage() using org.json library
### Description:
- Added fuctionality to store messages permanently.
- Auto - creates messages.json file. Uses org.json to format and save data correctly
## Unit Test
### Message:
- Test: Add LoginTest and MessageTest - all unit tests passing
### Description:
- Wrote complete JUnit tests: validate login rules, message creation, hash coorrectness, JSON storage.
- All tests pass
  
