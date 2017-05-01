val words = List("about", "every", "large", "plant", "spell",
  "these", "where", "after", "first", "learn", "point"
, "still", "thing", "which", "again", "found", "never", "right",
  "study", "think", "world", "below", "great", "other", "small"
, "their", "three", "would", "could", "house", "place", "sound",
  "there", "water", "write")




val seqs = List(
  "ayvizj",
  "uwgizj",
  "phvrmu",
  "",
  "tyuvb"
)


def word(seqs: List[String], words: List[String], idx: Int): String = words match {
  case Nil => ""
  case word :: Nil => word
  case _ => val newWords = words.filter(word => seqs(idx).toList.contains(word.charAt(idx)))
      word(seqs, newWords, idx + 1)
}

word(seqs, words, 0);
