Meal Suggester
Developer: Mzuzomuhle Buthelezi
Student Number: ST10222279
Group: 2
Course: Higher Certificate in Mobile Application and Web Development
Subject: IMAD5112
https://github.com/VCSTDN2024/imad5112-assignment-1-ST10222279
https://youtu.be/ylkdbF9HjL0?si=4Bhz3kcAFCtfBFZC

Project Overview
The Meal Suggester is a mobile application developed as part of an assignment in the Introduction to Mobile App Development subject. This application was created using the Kotlin programming language and Android Studio. The app's primary purpose is to assist in choosing what to eat when feeling indecisive. It suggests a meal for the user to consider making and eating at the click of a button.
The app was developed to meet the requirements of the assignment, which includes creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.


App Purpose and Features

Purpose:
The main goal of this app is to pick a meal at random that is appropriate for the time of day the user specified e.g “Morning”. 

Key Features:
- Text field to enter the time of day you want your meal for.
- A text and a picture of the meal suggested appears after clicking the “Suggest meal” button.
- A reset button that clears the current meal displayed.

These features aim to provide users with appetising meal choices when they’re not sure what they want to eat and an easy-to-use seamless user experience.


Design Considerations

The design of the Meal Suggester was based on the following key considerations:

1. User Experience (UX): The app was designed with the goal of providing an intuitive and easy-to-navigate user interface, ensuring a seamless user experience.

2. Responsiveness: The app was built to ensure it performs well on different screen sizes, with particular attention to device compatibility.

3. Simplicity: The design is  very minimalistic, focusing on core features without overwhelming the user.

4. Performance: Code optimization was considered to ensure fast response times and low battery usage.
GitHub Utilization

This project was managed using GitHub for version control, where all code changes were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

Challenges and Learnings

During the development of this project, I encountered several challenges, including:

1. Challenge: Initially, I faced a “Type mismatch:inferred type is Unit but Int was expected” error. This happened because of incorrect handling of the random() function and improperly structured return types.

Solution: I needed to ensure getMealSuggestion() correctly returned a Pair<String, Int>? and that null cases were handled properly.

2. Challenge: My UI layout had problems such as buttons being too wide, the input field stretching too much, and the image not centering when displayed.

Solution: I had to fix layout constraints, adjust button widths, and center the image properly using android:scaletype=fitCenter.
3. Challenge: There were syntax errors like private fun any}?.random() and typos in drawable refernces  (R.drawable. yoghurt had a space). 

Solution: I needed to carefully debug the code, fix syntax issues, and ensure that drawable refernces were correctly formatted.

From these challenges, I learned important lessons in debugging, using version control, and improved my understanding of Kotlin and UI design.
