function New-ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties -ArgumentList @(
            ${schedulerPeriodexpression}
        )
    }
}
