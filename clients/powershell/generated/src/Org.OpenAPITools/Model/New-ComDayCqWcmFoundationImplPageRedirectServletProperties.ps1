function New-ComDayCqWcmFoundationImplPageRedirectServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${excludedPeriodresourcePeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmFoundationImplPageRedirectServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmFoundationImplPageRedirectServletProperties -ArgumentList @(
            ${excludedPeriodresourcePeriodtypes}
        )
    }
}
