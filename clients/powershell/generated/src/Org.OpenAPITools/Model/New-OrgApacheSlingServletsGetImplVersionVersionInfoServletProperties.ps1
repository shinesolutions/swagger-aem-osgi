function New-OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodservletPeriodselectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${ecmaSuport}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties -ArgumentList @(
            ${slingPeriodservletPeriodselectors},
            ${ecmaSuport}
        )
    }
}
