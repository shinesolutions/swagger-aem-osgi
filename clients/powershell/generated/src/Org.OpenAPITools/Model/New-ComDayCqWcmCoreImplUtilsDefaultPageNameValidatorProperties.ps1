function New-ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${nonValidChars}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties -ArgumentList @(
            ${nonValidChars}
        )
    }
}
