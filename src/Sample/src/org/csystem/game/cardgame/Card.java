package org.csystem.game.cardgame;

public class Card 
{
   private CardValue m_value;
   private CardType m_type;			
   //...

   private static void fillDeck(Card [] deck)
   {
      int i = 0;

      for (CardType type : CardType.values())
         for (CardValue value : CardValue.values())
            deck[i++] = new Card(value, type);
   }

   public static Card [] getShuffledDeck()
   {
      Card [] deck = new Card[52];

      fillDeck(deck);

      //...

      return deck;
   }

   public Card(CardValue value, CardType type)
   {
      //...
      m_value = value;
      m_type = type;
   }

   public String toString()
   {
      return String.format("%s-%s", m_type.toString(), m_value.toString());
   }

   //...
}
