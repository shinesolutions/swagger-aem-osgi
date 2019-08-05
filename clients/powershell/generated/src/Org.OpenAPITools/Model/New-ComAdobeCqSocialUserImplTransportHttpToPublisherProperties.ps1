function New-ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${agentPeriodconfiguration},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${contextPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${disabledPeriodcipherPeriodsuites},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${enabledPeriodcipherPeriodsuites}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUserImplTransportHttpToPublisherProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUserImplTransportHttpToPublisherProperties -ArgumentList @(
            ${enable},
            ${agentPeriodconfiguration},
            ${contextPeriodpath},
            ${disabledPeriodcipherPeriodsuites},
            ${enabledPeriodcipherPeriodsuites}
        )
    }
}
