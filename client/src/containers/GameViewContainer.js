import React, { Component } from "react";
import GameBoards from '../components/GameComponents/GameBoards';

class GameViewContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      players: props.players,
      aliens: [],
      humans: [],
      cards: props.cards,
      cardsInPlay: [],
      immitationsBlockedBoard: [],
      immitationsPassBoard: []
    };
  }
  render() {
    return <p>I am the game GameViewContainer</p>;
  }
}

export default GameViewContainer;
