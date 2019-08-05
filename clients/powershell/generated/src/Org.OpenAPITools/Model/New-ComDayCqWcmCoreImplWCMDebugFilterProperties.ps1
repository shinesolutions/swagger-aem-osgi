function New-ComDayCqWcmCoreImplWCMDebugFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${wcmdbgfilterPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${wcmdbgfilterPeriodjspDebug}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplWCMDebugFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplWCMDebugFilterProperties -ArgumentList @(
            ${wcmdbgfilterPeriodenabled},
            ${wcmdbgfilterPeriodjspDebug}
        )
    }
}
