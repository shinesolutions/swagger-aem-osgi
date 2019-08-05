function New-OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${allowPeriodonlyPeriodsystemPerioduser}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties -ArgumentList @(
            ${allowPeriodonlyPeriodsystemPerioduser}
        )
    }
}
