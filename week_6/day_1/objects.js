const movie = {
    title: "It's a wonderful life",
    year: 1946,
    language: 'Spanish'
};

movie.cast = ['James Stewart', 'Donna Reid'];
movie.language = 'English';
movie['subtitle-language'] = "German";
// delete movie.year;

movie.ratings = {
    critic: 94,
    audience: 95
};

for (const key in movie) {
    console.log(movie[key])
}