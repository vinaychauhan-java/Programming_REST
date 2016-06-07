<html>
<body>
	<h1>File Uploading Example with Jersey</h1>

	<form action="rest/uploadFile" method="post"
		enctype="multipart/form-data">

		<p>
			Please Select the file : <input type="file" name="file" size="45" />
		</p>

		<input type="submit" value="Upload It" />
	</form>

	<!-- 
	This example have dependencies on following Jars :-
	  (1) jersey-multipart-1.8.jar
	  (2) mimepull-1.8.jar
	 -->
	 
</body>
</html>