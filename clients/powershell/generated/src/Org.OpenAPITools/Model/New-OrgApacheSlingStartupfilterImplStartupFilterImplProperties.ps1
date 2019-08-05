function New-OrgApacheSlingStartupfilterImplStartupFilterImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${activePeriodbyPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultPeriodmessage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingStartupfilterImplStartupFilterImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingStartupfilterImplStartupFilterImplProperties -ArgumentList @(
            ${activePeriodbyPerioddefault},
            ${defaultPeriodmessage}
        )
    }
}
