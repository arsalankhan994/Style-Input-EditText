How to use:

Step 1:
Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2:

Add the dependency

dependencies {
	        implementation 'com.github.arsalankhan994:Style-Input-EditText:1.0.0'
	}
  
That's it. Now open your java file:

String email = emailEditText.getEditText().getText().toString();
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailEditText.setError(true);
                    emailEditText.getEditText().setError("Email address not correct .", null);
                } else {
                    emailEditText.setError(false);
                }

For xml file:

<com.erselankhan.styleinputedittext.StyleInputEditText
        android:id="@+id/email_address"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        app:editTextHint="@string/email"
        app:inputType="email" />
