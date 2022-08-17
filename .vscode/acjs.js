const axios = require("axios");

async function getDataForEach(ids) {
    ListForData = [];
    ids.forEach(async (id) => {
        const result = await axios.get("https://reqbin.com/echo/get/json");
        ListForData.push(result.data);
    });
    ListForData.forEach((item) => console.log(item));
}
async function getDataFor(ids) {
    ListForData = [];
    for (i = 0; i<ids.length; i++){
        const result = await axios.get("https://reqbin.com/echo/get/json");
        ListForData.push(result.data);
    }
    ListForData.forEach((item) => console.log(item));
    
}
getDataFor([1, 2, 3]).then(console.log("done"));
getDataForEach([1, 2, 3]).then(console.log("done"));