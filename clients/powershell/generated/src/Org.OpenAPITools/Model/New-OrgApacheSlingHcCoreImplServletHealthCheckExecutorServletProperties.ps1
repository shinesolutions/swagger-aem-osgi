function New-OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${servletPath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${disabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${corsPeriodaccessControlAllowOrigin}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties -ArgumentList @(
            ${servletPath},
            ${disabled},
            ${corsPeriodaccessControlAllowOrigin}
        )
    }
}
