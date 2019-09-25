package com.hiraok.smartcompass

interface ReducerType<STATE : StateType, ACTION : ActionType> {
    fun reduce(state: STATE, action: ACTION)
}