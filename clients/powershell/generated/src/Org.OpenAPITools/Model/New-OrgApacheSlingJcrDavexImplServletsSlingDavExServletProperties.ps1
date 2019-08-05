function New-OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${alias},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${davPeriodcreateMinusabsoluteMinusuri},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${davPeriodprotectedhandlers}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties -ArgumentList @(
            ${alias},
            ${davPeriodcreateMinusabsoluteMinusuri},
            ${davPeriodprotectedhandlers}
        )
    }
}
