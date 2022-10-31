package com.portto.fcl.provider.blocto.web

import com.portto.fcl.Fcl
import com.portto.fcl.config.Network

internal object BloctoWebUtils {
    private const val AUTHN_STAGING_URL = "https://flow-wallet-testnet.blocto.app/api/flow/authn"
    private const val AUTHN_PRODUCTION_URL = "https://flow-wallet.blocto.app/api/flow/authn"

    fun getAuthnUrl(env: Network?): String {
        if (env == null) {
            throw Exception("Network must be specified")
        }
        return when (env) {
            Network.MAINNET -> AUTHN_PRODUCTION_URL
            Network.TESTNET -> AUTHN_STAGING_URL
            Network.LOCAL -> Fcl.config.authnUrl
            Network.CANARYNET -> throw Exception("Canarynet not available")
        }
    }
}
