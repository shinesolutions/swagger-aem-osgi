function New-ComDayCqWcmFoundationFormsImplMailServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodresourceTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodselectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${resourcePeriodblacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmFoundationFormsImplMailServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmFoundationFormsImplMailServletProperties -ArgumentList @(
            ${slingPeriodservletPeriodresourceTypes},
            ${slingPeriodservletPeriodselectors},
            ${resourcePeriodwhitelist},
            ${resourcePeriodblacklist}
        )
    }
}
