/* Generated By:JavaCC: Do not edit this line. AugmentedGMLParserTokenManager.java */
package org.wilmascope.gmlparser;

public class AugmentedGMLParserTokenManager implements AugmentedGMLParserConstants {
	static int nestingLevel = 0;
	public java.io.PrintStream debugStream = System.out;

	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(int pos, long active0) {
		switch (pos) {
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(int pos, long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private final int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private final int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	private final int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 71:
			return jjMoveStringLiteralDfa1_0(0x100L);
		case 76:
			return jjMoveStringLiteralDfa1_0(0xc0L);
		case 91:
			return jjStopAtPos(0, 33);
		case 93:
			return jjStopAtPos(0, 34);
		case 100:
			return jjMoveStringLiteralDfa1_0(0x80000L);
		case 101:
			return jjMoveStringLiteralDfa1_0(0x402800L);
		case 103:
			return jjMoveStringLiteralDfa1_0(0x20200L);
		case 105:
			return jjMoveStringLiteralDfa1_0(0x10800000L);
		case 108:
			return jjMoveStringLiteralDfa1_0(0x1000000L);
		case 110:
			return jjMoveStringLiteralDfa1_0(0x300400L);
		case 115:
			return jjMoveStringLiteralDfa1_0(0xa001000L);
		case 116:
			return jjMoveStringLiteralDfa1_0(0x4000000L);
		case 118:
			return jjMoveStringLiteralDfa1_0(0x20040000L);
		default:
			return jjMoveNfa_0(0, 0);
		}
	}

	private final int jjMoveStringLiteralDfa1_0(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case 97:
			return jjMoveStringLiteralDfa2_0(active0, 0x25100080L);
		case 100:
			if ((active0 & 0x800000L) != 0L)
				return jjStopAtPos(1, 23);
			return jjMoveStringLiteralDfa2_0(active0, 0x402800L);
		case 101:
			return jjMoveStringLiteralDfa2_0(active0, 0x8040000L);
		case 105:
			return jjMoveStringLiteralDfa2_0(active0, 0x80040L);
		case 111:
			return jjMoveStringLiteralDfa2_0(active0, 0x2200400L);
		case 114:
			return jjMoveStringLiteralDfa2_0(active0, 0x20300L);
		case 116:
			return jjMoveStringLiteralDfa2_0(active0, 0x10001000L);
		default:
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private final int jjMoveStringLiteralDfa2_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(0, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(1, active0);
			return 2;
		}
		switch (curChar) {
		case 97:
			return jjMoveStringLiteralDfa3_0(active0, 0x20300L);
		case 98:
			return jjMoveStringLiteralDfa3_0(active0, 0x1000080L);
		case 100:
			return jjMoveStringLiteralDfa3_0(active0, 0x200400L);
		case 101:
			return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
		case 103:
			return jjMoveStringLiteralDfa3_0(active0, 0x402800L);
		case 108:
			return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
		case 109:
			return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
		case 110:
			return jjMoveStringLiteralDfa3_0(active0, 0x40L);
		case 114:
			return jjMoveStringLiteralDfa3_0(active0, 0xc0c0000L);
		case 117:
			return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
		case 121:
			return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
		default:
			break;
		}
		return jjStartNfa_0(1, active0);
	}

	private final int jjMoveStringLiteralDfa3_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(1, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(2, active0);
			return 3;
		}
		switch (curChar) {
		case 101:
			if ((active0 & 0x40L) != 0L)
				return jjStopAtPos(3, 6);
			else if ((active0 & 0x100000L) != 0L)
				return jjStopAtPos(3, 20);
			else if ((active0 & 0x200000L) != 0L) {
				jjmatchedKind = 21;
				jjmatchedPos = 3;
			} else if ((active0 & 0x400000L) != 0L) {
				jjmatchedKind = 22;
				jjmatchedPos = 3;
			}
			return jjMoveStringLiteralDfa4_0(active0, 0x1082c80L);
		case 103:
			return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
		case 105:
			return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
		case 108:
			return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
		case 109:
			if ((active0 & 0x10000000L) != 0L)
				return jjStopAtPos(3, 28);
			break;
		case 112:
			return jjMoveStringLiteralDfa4_0(active0, 0x20300L);
		case 114:
			return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
		case 115:
			return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
		case 117:
			return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
		default:
			break;
		}
		return jjStartNfa_0(2, active0);
	}

	private final int jjMoveStringLiteralDfa4_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(2, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(3, active0);
			return 4;
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
		case 95:
			return jjMoveStringLiteralDfa5_0(active0, 0xc00L);
		case 99:
			return jjMoveStringLiteralDfa5_0(active0, 0x2080000L);
		case 101:
			if ((active0 & 0x1000L) != 0L)
				return jjStopAtPos(4, 12);
			else if ((active0 & 0x20000000L) != 0L)
				return jjStopAtPos(4, 29);
			return jjMoveStringLiteralDfa5_0(active0, 0xc000000L);
		case 104:
			if ((active0 & 0x20000L) != 0L) {
				jjmatchedKind = 17;
				jjmatchedPos = 4;
			}
			return jjMoveStringLiteralDfa5_0(active0, 0x300L);
		case 105:
			return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
		case 108:
			if ((active0 & 0x1000000L) != 0L)
				return jjStopAtPos(4, 24);
			return jjMoveStringLiteralDfa5_0(active0, 0x80L);
		default:
			break;
		}
		return jjStartNfa_0(3, active0);
	}

	private final int jjMoveStringLiteralDfa5_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(3, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(4, active0);
			return 5;
		}
		switch (curChar) {
		case 71:
			return jjMoveStringLiteralDfa6_0(active0, 0x80L);
		case 101:
			if ((active0 & 0x2000000L) != 0L)
				return jjStopAtPos(5, 25);
			break;
		case 105:
			return jjMoveStringLiteralDfa6_0(active0, 0x300L);
		case 110:
			return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
		case 111:
			return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
		case 115:
			if ((active0 & 0x8000000L) != 0L)
				return jjStopAtPos(5, 27);
			return jjMoveStringLiteralDfa6_0(active0, 0xc00L);
		case 116:
			if ((active0 & 0x4000000L) != 0L)
				return jjStopAtPos(5, 26);
			return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
		default:
			break;
		}
		return jjStartNfa_0(4, active0);
	}

	private final int jjMoveStringLiteralDfa6_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(4, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(5, active0);
			return 6;
		}
		switch (curChar) {
		case 99:
			return jjMoveStringLiteralDfa7_0(active0, 0x2300L);
		case 101:
			return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
		case 110:
			if ((active0 & 0x40000L) != 0L)
				return jjStopAtPos(6, 18);
			break;
		case 114:
			return jjMoveStringLiteralDfa7_0(active0, 0x80L);
		case 116:
			return jjMoveStringLiteralDfa7_0(active0, 0xc00L);
		default:
			break;
		}
		return jjStartNfa_0(5, active0);
	}

	private final int jjMoveStringLiteralDfa7_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(5, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(6, active0);
			return 7;
		}
		switch (curChar) {
		case 97:
			return jjMoveStringLiteralDfa8_0(active0, 0x80L);
		case 100:
			if ((active0 & 0x80000L) != 0L)
				return jjStopAtPos(7, 19);
			break;
		case 104:
			return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
		case 115:
			if ((active0 & 0x100L) != 0L)
				return jjStopAtPos(7, 8);
			else if ((active0 & 0x200L) != 0L)
				return jjStopAtPos(7, 9);
			break;
		case 121:
			return jjMoveStringLiteralDfa8_0(active0, 0xc00L);
		default:
			break;
		}
		return jjStartNfa_0(6, active0);
	}

	private final int jjMoveStringLiteralDfa8_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(6, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(7, active0);
			return 8;
		}
		switch (curChar) {
		case 108:
			return jjMoveStringLiteralDfa9_0(active0, 0xc00L);
		case 111:
			return jjMoveStringLiteralDfa9_0(active0, 0x2000L);
		case 112:
			return jjMoveStringLiteralDfa9_0(active0, 0x80L);
		default:
			break;
		}
		return jjStartNfa_0(7, active0);
	}

	private final int jjMoveStringLiteralDfa9_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(7, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(8, active0);
			return 9;
		}
		switch (curChar) {
		case 101:
			if ((active0 & 0x400L) != 0L)
				return jjStopAtPos(9, 10);
			else if ((active0 & 0x800L) != 0L)
				return jjStopAtPos(9, 11);
			break;
		case 104:
			return jjMoveStringLiteralDfa10_0(active0, 0x80L);
		case 114:
			if ((active0 & 0x2000L) != 0L)
				return jjStopAtPos(9, 13);
			break;
		default:
			break;
		}
		return jjStartNfa_0(8, active0);
	}

	private final int jjMoveStringLiteralDfa10_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(8, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(9, active0);
			return 10;
		}
		switch (curChar) {
		case 105:
			return jjMoveStringLiteralDfa11_0(active0, 0x80L);
		default:
			break;
		}
		return jjStartNfa_0(9, active0);
	}

	private final int jjMoveStringLiteralDfa11_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(9, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(10, active0);
			return 11;
		}
		switch (curChar) {
		case 99:
			return jjMoveStringLiteralDfa12_0(active0, 0x80L);
		default:
			break;
		}
		return jjStartNfa_0(10, active0);
	}

	private final int jjMoveStringLiteralDfa12_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(10, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(11, active0);
			return 12;
		}
		switch (curChar) {
		case 115:
			if ((active0 & 0x80L) != 0L)
				return jjStopAtPos(12, 7);
			break;
		default:
			break;
		}
		return jjStartNfa_0(11, active0);
	}

	private final void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private final void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private final void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private final void jjCheckNAddStates(int start, int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

	private final void jjCheckNAddStates(int start) {
		jjCheckNAdd(jjnextStates[start]);
		jjCheckNAdd(jjnextStates[start + 1]);
	}

	static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };

	private final int jjMoveNfa_0(int startState, int curPos) {
		int[] nextStates;
		int startsAt = 0;
		jjnewStateCnt = 10;
		int i = 1;
		jjstateSet[0] = startState;
		int j, kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 30)
								kind = 30;
							jjCheckNAddStates(0, 2);
						} else if (curChar == 34)
							jjCheckNAddTwoStates(3, 4);
						else if (curChar == 46)
							jjCheckNAdd(1);
						break;
					case 1:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 31)
							kind = 31;
						jjCheckNAdd(1);
						break;
					case 2:
						if (curChar == 34)
							jjCheckNAddTwoStates(3, 4);
						break;
					case 3:
						if ((0xfffffffbffffffffL & l) != 0L)
							jjCheckNAddTwoStates(3, 4);
						break;
					case 4:
						if (curChar == 34 && kind > 32)
							kind = 32;
						break;
					case 5:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 30)
							kind = 30;
						jjCheckNAddStates(0, 2);
						break;
					case 6:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 30)
							kind = 30;
						jjCheckNAdd(6);
						break;
					case 7:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 31)
							kind = 31;
						jjCheckNAddTwoStates(7, 8);
						break;
					case 8:
						if (curChar == 46)
							jjCheckNAdd(9);
						break;
					case 9:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 31)
							kind = 31;
						jjCheckNAdd(9);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 3:
						jjAddStates(3, 4);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 3:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjAddStates(3, 4);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	private final int jjMoveStringLiteralDfa0_1() {
		switch (curChar) {
		case 91:
			return jjStopAtPos(0, 14);
		case 93:
			return jjStopAtPos(0, 15);
		default:
			return 1;
		}
	}

	static final int[] jjnextStates = { 6, 7, 8, 3, 4, };
	public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, "\147\162\141\160\150", "\166\145\162\163\151\157\156",
			"\144\151\162\145\143\164\145\144", "\156\141\155\145", "\156\157\144\145", "\145\144\147\145", "\151\144",
			"\154\141\142\145\154", "\163\157\165\162\143\145", "\164\141\162\147\145\164", "\163\145\162\151\145\163",
			"\151\164\145\155", "\166\141\154\165\145", null, null, null, "\133", "\135", };
	public static final String[] lexStateNames = { "DEFAULT", "IN_IGNORABLE", };
	public static final int[] jjnewLexState = { -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, };
	static final long[] jjtoToken = { 0x7fffe0001L, };
	static final long[] jjtoSkip = { 0xfffeL, };
	static final long[] jjtoMore = { 0x10000L, };
	protected SimpleCharStream input_stream;
	private final int[] jjrounds = new int[10];
	private final int[] jjstateSet = new int[20];
	StringBuffer image;
	int jjimageLen;
	int lengthOfMatch;
	protected char curChar;

	public AugmentedGMLParserTokenManager(SimpleCharStream stream) {
		if (SimpleCharStream.staticFlag)
			throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		input_stream = stream;
	}

	public AugmentedGMLParserTokenManager(SimpleCharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	public void ReInit(SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private final void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 10; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}

	public void ReInit(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	public void SwitchTo(int lexState) {
		if (lexState >= 2 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		else
			curLexState = lexState;
	}

	protected Token jjFillToken() {
		Token t = Token.newToken(jjmatchedKind);
		t.kind = jjmatchedKind;
		String im = jjstrLiteralImages[jjmatchedKind];
		t.image = (im == null) ? input_stream.GetImage() : im;
		t.beginLine = input_stream.getBeginLine();
		t.beginColumn = input_stream.getBeginColumn();
		t.endLine = input_stream.getEndLine();
		t.endColumn = input_stream.getEndColumn();
		return t;
	}

	int curLexState = 0;
	int defaultLexState = 0;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;

	public Token getNextToken() {
		int kind;
		Token specialToken = null;
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				return matchedToken;
			}
			image = null;
			jjimageLen = 0;

			for (;;) {
				switch (curLexState) {
				case 0:
					try {
						input_stream.backup(0);
						while ((curChar < 64 && (0x100002600L & (1L << curChar)) != 0L) || (curChar >> 6) == 1
								&& (0x10000000L & (1L << (curChar & 077))) != 0L)
							curChar = input_stream.BeginToken();
					} catch (java.io.IOException e1) {
						continue EOFLoop;
					}
					jjmatchedKind = 0x7fffffff;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_0();
					break;
				case 1:
					jjmatchedKind = 0x7fffffff;
					jjmatchedPos = 0;
					curPos = jjMoveStringLiteralDfa0_1();
					if (jjmatchedPos == 0 && jjmatchedKind > 16) {
						jjmatchedKind = 16;
					}
					break;
				}
				if (jjmatchedKind != 0x7fffffff) {
					if (jjmatchedPos + 1 < curPos)
						input_stream.backup(curPos - jjmatchedPos - 1);
					if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						matchedToken = jjFillToken();
						TokenLexicalActions(matchedToken);
						if (jjnewLexState[jjmatchedKind] != -1)
							curLexState = jjnewLexState[jjmatchedKind];
						return matchedToken;
					} else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						SkipLexicalActions(null);
						if (jjnewLexState[jjmatchedKind] != -1)
							curLexState = jjnewLexState[jjmatchedKind];
						continue EOFLoop;
					}
					jjimageLen += jjmatchedPos + 1;
					if (jjnewLexState[jjmatchedKind] != -1)
						curLexState = jjnewLexState[jjmatchedKind];
					curPos = 0;
					jjmatchedKind = 0x7fffffff;
					try {
						curChar = input_stream.readChar();
						continue;
					} catch (java.io.IOException e1) {
					}
				}
				int error_line = input_stream.getEndLine();
				int error_column = input_stream.getEndColumn();
				String error_after = null;
				boolean EOFSeen = false;
				try {
					input_stream.readChar();
					input_stream.backup(1);
				} catch (java.io.IOException e1) {
					EOFSeen = true;
					error_after = curPos <= 1 ? "" : input_stream.GetImage();
					if (curChar == '\n' || curChar == '\r') {
						error_line++;
						error_column = 0;
					} else
						error_column++;
				}
				if (!EOFSeen) {
					input_stream.backup(1);
					error_after = curPos <= 1 ? "" : input_stream.GetImage();
				}
				throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
						TokenMgrError.LEXICAL_ERROR);
			}
		}
	}

	void SkipLexicalActions(Token matchedToken) {
		switch (jjmatchedKind) {
		case 14:
			if (image == null)
				image = new StringBuffer(new String(input_stream.GetSuffix(jjimageLen
						+ (lengthOfMatch = jjmatchedPos + 1))));
			else
				image.append(new String(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1))));
			nestingLevel++;
			break;
		case 15:
			if (image == null)
				image = new StringBuffer(new String(input_stream.GetSuffix(jjimageLen
						+ (lengthOfMatch = jjmatchedPos + 1))));
			else
				image.append(new String(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1))));
			if (--nestingLevel == 0)
				SwitchTo(DEFAULT);
			break;
		default:
			break;
		}
	}

	void TokenLexicalActions(Token matchedToken) {
		switch (jjmatchedKind) {
		case 32:
			if (image == null)
				image = new StringBuffer(new String(input_stream.GetSuffix(jjimageLen
						+ (lengthOfMatch = jjmatchedPos + 1))));
			else
				image.append(new String(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1))));
			matchedToken.image = matchedToken.image.substring(1, lengthOfMatch - 1);
			break;
		default:
			break;
		}
	}
}
