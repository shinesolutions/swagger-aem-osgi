function New-ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties -ArgumentList @(
            ${processPeriodlabel}
        )
    }
}
