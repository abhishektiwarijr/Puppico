/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import java.util.UUID

object PuppyDataProvider {
    val puppies = mutableListOf<Puppy>(
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/affenpinscher/n02110627_12025.jpg",
            "Charlie",
            "Affenpinscher",
            12,
            "Male",
            "West Paducah, KY",
            0.2f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/african/n02116738_7537.jpg",
            "Milo",
            "African",
            16,
            "Male",
            "Pittsford, NY",
            0.22f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/airedale/n02096051_441.jpg",
            "Archie",
            "Airedale",
            15,
            "Male",
            "Melber, KY",
            0.25f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/akita/Akita_hiking_in_Shpella_e_Pellumbasit.jpg",
            "Max",
            "Akita",
            13,
            "Male",
            "Philipsburg, PA",
            0.28f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/appenzeller/n02107908_754.jpg",
            "Buddy",
            "Appenzeller",
            14,
            "Male",
            "Wisconsin Rapids, WI",
            0.3f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/basenji/n02110806_4167.jpg",
            "Oscar",
            "Basenji",
            16,
            "Male",
            "Wichita Falls, TX",
            0.32f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/beagle/n02088364_5427.jpg",
            "Ollie",
            "Beagle",
            18,
            "Male",
            "Pittsburg, NH",
            0.33f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/bluetick/n02088632_2709.jpg",
            "Toby",
            "Bluetick",
            21,
            "Male",
            "South Gate, CA",
            0.35f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/borzoi/n02090622_7663.jpg",
            "Jack",
            "Borzoi",
            17,
            "Male",
            "Beltsville, MD",
            0.35f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/bouvier/n02106382_7088.jpg",
            "Teddy",
            "Bouvier",
            19,
            "Male",
            "Como, MS",
            0.39f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/boxer/n02108089_13526.jpg",
            "Bella",
            "Boxer",
            16,
            "Female",
            "West Paducah, KY",
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/brabancon/n02112706_1453.jpg",
            "Molly",
            "Brabancon",
            13,
            "Female",
            "Pittsford, NY",
            0.32f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/briard/n02105251_7056.jpg",
            "Coco",
            "Briard",
            19,
            "Female",
            "Pittsburg, NH",
            0.35f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/cairn/n02096177_6127.jpg",
            "Ruby",
            "Cairn",
            17,
            "Female",
            "Wichita Falls, TX",
            0.35f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/chihuahua/n02085620_5713.jpg",
            "Lucy",
            "Chihuahua",
            21,
            "Male",
            "Wisconsin Rapids, WI",
            0.4f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/chow/n02112137_6164.jpg",
            "Bailey",
            "Chow",
            16,
            "Female",
            "Philipsburg, PA",
            0.41f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/clumber/n02101556_482.jpg",
            "Daisy",
            "Clumber",
            14,
            "Female",
            "Melber, KY",
            0.45f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/cockapoo/bubbles1.jpg",
            "Rosie",
            "Cockapoo",
            13,
            "Female",
            "Como, MS",
            0.45f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/coonhound/n02089078_3532.jpg",
            "Frankie",
            "Coonhound",
            17,
            "Female",
            "Beltsville, MD",
            0.46f
        ),
        Puppy(
            id = UUID.randomUUID().toString(),
            "https://images.dog.ceo/breeds/cotondetulear/IMG_20160830_202631573.jpg",
            "Lola",
            "Cotondetulear",
            18,
            "Female",
            "South Gate, CA",
            0.49f
        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/dachshund/Daschund-2.jpg", "Dachshund", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/dalmatian/cooper2.jpg", "Dalmatian", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/dhole/n02115913_1066.jpg", "Dhole", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/dingo/n02115641_4607.jpg", "Dingo", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/doberman/n02107142_413.jpg", "Doberman", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/entlebucher/n02108000_3236.jpg",
//            "Entlebucher",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/eskimo/n02109961_9348.jpg", "Eskimo", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/germanshepherd/n02106662_3431.jpg",
//            "German Shepherd",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/groenendael/n02105056_2894.jpg",
//            "Groenendael",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/havanese/00100trPORTRAIT_00100_BURST20191126134713895_COVER.jpg",
//            "Havanese",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/husky/n02110185_698.jpg", "Husky", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/keeshond/n02112350_7253.jpg", "Keeshond", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/kelpie/n02105412_7843.jpg", "Kelpie", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/komondor/n02105505_3578.jpg", "Komondor", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/kuvasz/n02104029_4791.jpg", "Kuvasz", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/labrador/n02099712_3340.jpg", "Labrador", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/leonberg/n02111129_547.jpg", "Leonberg", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/lhasa/n02098413_2700.jpg", "Lhasa", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/malamute/n02110063_938.jpg", "Malamute", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/malinois/n02105162_8950.jpg", "Malinois", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/maltese/n02085936_2741.jpg", "Maltese", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/mexicanhairless/n02113978_471.jpg",
//            "Mexicanhairless",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/mix/cherry.jpg", "Mix", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/newfoundland/n02111277_7088.jpg",
//            "Newfoundland",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/otterhound/n02091635_3703.jpg",
//            "Otterhound",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/papillon/n02086910_4182.jpg", "Papillon", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/pekinese/n02086079_6180.jpg", "Pekinese", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/pembroke/n02113023_4128.jpg", "Pembroke", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/pitbull/IMG_20190826_121528_876.jpg",
//            "Pitbull",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/pomeranian/n02112018_1463.jpg",
//            "Pomeranian",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/pug/n02110958_11870.jpg", "Pug", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/puggle/IMG_074816.jpg", "Puggle", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/pyrenees/n02111500_260.jpg", "Pyrenees", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/redbone/n02090379_4718.jpg", "Redbone", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/rottweiler/n02106550_11415.jpg",
//            "Rottweiler",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/saluki/n02091831_1512.jpg", "Saluki", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/samoyed/n02111889_1421.jpg", "Samoyed", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/schipperke/n02104365_6498.jpg",
//            "Schipperke",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/shiba/shiba-3i.jpg", "Shiba", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/shihtzu/n02086240_7079.jpg", "Shihtzu", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/stbernard/n02109525_12875.jpg",
//            "Stbernard",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/vizsla/n02100583_11888.jpg", "Vizsla", 16, "Male"),
//        Puppy(id = UUID.randomUUID().toString(),
//            "https://images.dog.ceo/breeds/weimaraner/n02092339_928.jpg",
//            "Weimaraner",
//            16,
//            "Male"
//        ),
//        Puppy(id = UUID.randomUUID().toString(),"https://images.dog.ceo/breeds/whippet/n02091134_16005.jpg", "Whippet", 16, "Male"),
    )
}
