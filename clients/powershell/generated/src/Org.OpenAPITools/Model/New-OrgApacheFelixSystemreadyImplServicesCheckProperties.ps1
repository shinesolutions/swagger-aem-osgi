function New-OrgApacheFelixSystemreadyImplServicesCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servicesPeriodlist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${type}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixSystemreadyImplServicesCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixSystemreadyImplServicesCheckProperties -ArgumentList @(
            ${servicesPeriodlist},
            ${type}
        )
    }
}
