function New-OrgApacheFelixJaasConfigurationFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${jaasPeriodcontrolFlag},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${jaasPeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jaasPeriodrealmName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jaasPeriodclassname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${jaasPeriodoptions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixJaasConfigurationFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixJaasConfigurationFactoryProperties -ArgumentList @(
            ${jaasPeriodcontrolFlag},
            ${jaasPeriodranking},
            ${jaasPeriodrealmName},
            ${jaasPeriodclassname},
            ${jaasPeriodoptions}
        )
    }
}
