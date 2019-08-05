function New-ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodenablePeriodsha1}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties -ArgumentList @(
            ${processPeriodlabel},
            ${cqPerioddamPeriodenablePeriodsha1}
        )
    }
}
