function New-ComAdobeAemTransactionCoreImplTransactionRecorderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${isTransactionRecordingEnabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemTransactionCoreImplTransactionRecorderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemTransactionCoreImplTransactionRecorderProperties -ArgumentList @(
            ${isTransactionRecordingEnabled}
        )
    }
}
