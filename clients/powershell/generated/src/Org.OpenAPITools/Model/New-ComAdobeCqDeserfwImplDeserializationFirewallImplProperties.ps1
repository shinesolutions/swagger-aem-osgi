function New-ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${firewallPerioddeserializationPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${firewallPerioddeserializationPeriodblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${firewallPerioddeserializationPerioddiagnostics}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDeserfwImplDeserializationFirewallImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDeserfwImplDeserializationFirewallImplProperties -ArgumentList @(
            ${firewallPerioddeserializationPeriodwhitelist},
            ${firewallPerioddeserializationPeriodblacklist},
            ${firewallPerioddeserializationPerioddiagnostics}
        )
    }
}
