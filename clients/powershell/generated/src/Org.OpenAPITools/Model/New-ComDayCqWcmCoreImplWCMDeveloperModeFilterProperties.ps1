function New-ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${wcmdevmodefilterPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties -ArgumentList @(
            ${wcmdevmodefilterPeriodenabled}
        )
    }
}
