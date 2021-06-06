chrome.webRequest.onAuthRequired.addListener(
function handler(details){
 return {'authCredentials': {Username: "yourusername", password: "yourpassword"}};
},
{urls:["<all_urls>"]},
['blocking']);