function New-OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPerioddescription}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties -ArgumentList @(
            ${slingPeriodname},
            ${slingPerioddescription}
        )
    }
}
