using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties:  IEquatable<OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public ConfigNodePropertyDropDown Type { get; private set; }

        /// <summary>
        /// ImportMode
        /// </summary>
        public ConfigNodePropertyString ImportMode { get; private set; }

        /// <summary>
        /// AclHandling
        /// </summary>
        public ConfigNodePropertyString AclHandling { get; private set; }

        /// <summary>
        /// PackageRoots
        /// </summary>
        public ConfigNodePropertyString PackageRoots { get; private set; }

        /// <summary>
        /// PackageFilters
        /// </summary>
        public ConfigNodePropertyArray PackageFilters { get; private set; }

        /// <summary>
        /// PropertyFilters
        /// </summary>
        public ConfigNodePropertyArray PropertyFilters { get; private set; }

        /// <summary>
        /// TempFsFolder
        /// </summary>
        public ConfigNodePropertyString TempFsFolder { get; private set; }

        /// <summary>
        /// UseBinaryReferences
        /// </summary>
        public ConfigNodePropertyBoolean UseBinaryReferences { get; private set; }

        /// <summary>
        /// AutoSaveThreshold
        /// </summary>
        public ConfigNodePropertyInteger AutoSaveThreshold { get; private set; }

        /// <summary>
        /// CleanupDelay
        /// </summary>
        public ConfigNodePropertyInteger CleanupDelay { get; private set; }

        /// <summary>
        /// FileThreshold
        /// </summary>
        public ConfigNodePropertyInteger FileThreshold { get; private set; }

        /// <summary>
        /// MEGA_BYTES
        /// </summary>
        public ConfigNodePropertyDropDown MEGA_BYTES { get; private set; }

        /// <summary>
        /// UseOffHeapMemory
        /// </summary>
        public ConfigNodePropertyBoolean UseOffHeapMemory { get; private set; }

        /// <summary>
        /// DigestAlgorithm
        /// </summary>
        public ConfigNodePropertyDropDown DigestAlgorithm { get; private set; }

        /// <summary>
        /// MonitoringQueueSize
        /// </summary>
        public ConfigNodePropertyInteger MonitoringQueueSize { get; private set; }

        /// <summary>
        /// PathsMapping
        /// </summary>
        public ConfigNodePropertyArray PathsMapping { get; private set; }

        /// <summary>
        /// StrictImport
        /// </summary>
        public ConfigNodePropertyBoolean StrictImport { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties()
        {
        }

        private OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(ConfigNodePropertyString Name, ConfigNodePropertyDropDown Type, ConfigNodePropertyString ImportMode, ConfigNodePropertyString AclHandling, ConfigNodePropertyString PackageRoots, ConfigNodePropertyArray PackageFilters, ConfigNodePropertyArray PropertyFilters, ConfigNodePropertyString TempFsFolder, ConfigNodePropertyBoolean UseBinaryReferences, ConfigNodePropertyInteger AutoSaveThreshold, ConfigNodePropertyInteger CleanupDelay, ConfigNodePropertyInteger FileThreshold, ConfigNodePropertyDropDown MEGA_BYTES, ConfigNodePropertyBoolean UseOffHeapMemory, ConfigNodePropertyDropDown DigestAlgorithm, ConfigNodePropertyInteger MonitoringQueueSize, ConfigNodePropertyArray PathsMapping, ConfigNodePropertyBoolean StrictImport)
        {
            
            this.Name = Name;
            
            this.Type = Type;
            
            this.ImportMode = ImportMode;
            
            this.AclHandling = AclHandling;
            
            this.PackageRoots = PackageRoots;
            
            this.PackageFilters = PackageFilters;
            
            this.PropertyFilters = PropertyFilters;
            
            this.TempFsFolder = TempFsFolder;
            
            this.UseBinaryReferences = UseBinaryReferences;
            
            this.AutoSaveThreshold = AutoSaveThreshold;
            
            this.CleanupDelay = CleanupDelay;
            
            this.FileThreshold = FileThreshold;
            
            this.MEGA_BYTES = MEGA_BYTES;
            
            this.UseOffHeapMemory = UseOffHeapMemory;
            
            this.DigestAlgorithm = DigestAlgorithm;
            
            this.MonitoringQueueSize = MonitoringQueueSize;
            
            this.PathsMapping = PathsMapping;
            
            this.StrictImport = StrictImport;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder</returns>
        public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Type(Type)
                .ImportMode(ImportMode)
                .AclHandling(AclHandling)
                .PackageRoots(PackageRoots)
                .PackageFilters(PackageFilters)
                .PropertyFilters(PropertyFilters)
                .TempFsFolder(TempFsFolder)
                .UseBinaryReferences(UseBinaryReferences)
                .AutoSaveThreshold(AutoSaveThreshold)
                .CleanupDelay(CleanupDelay)
                .FileThreshold(FileThreshold)
                .MEGA_BYTES(MEGA_BYTES)
                .UseOffHeapMemory(UseOffHeapMemory)
                .DigestAlgorithm(DigestAlgorithm)
                .MonitoringQueueSize(MonitoringQueueSize)
                .PathsMapping(PathsMapping)
                .StrictImport(StrictImport);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties left, OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties left, OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyDropDown _Type;
            private ConfigNodePropertyString _ImportMode;
            private ConfigNodePropertyString _AclHandling;
            private ConfigNodePropertyString _PackageRoots;
            private ConfigNodePropertyArray _PackageFilters;
            private ConfigNodePropertyArray _PropertyFilters;
            private ConfigNodePropertyString _TempFsFolder;
            private ConfigNodePropertyBoolean _UseBinaryReferences;
            private ConfigNodePropertyInteger _AutoSaveThreshold;
            private ConfigNodePropertyInteger _CleanupDelay;
            private ConfigNodePropertyInteger _FileThreshold;
            private ConfigNodePropertyDropDown _MEGA_BYTES;
            private ConfigNodePropertyBoolean _UseOffHeapMemory;
            private ConfigNodePropertyDropDown _DigestAlgorithm;
            private ConfigNodePropertyInteger _MonitoringQueueSize;
            private ConfigNodePropertyArray _PathsMapping;
            private ConfigNodePropertyBoolean _StrictImport;

            internal OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder Type(ConfigNodePropertyDropDown value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.ImportMode property.
            /// </summary>
            /// <param name="value">ImportMode</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder ImportMode(ConfigNodePropertyString value)
            {
                _ImportMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.AclHandling property.
            /// </summary>
            /// <param name="value">AclHandling</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder AclHandling(ConfigNodePropertyString value)
            {
                _AclHandling = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.PackageRoots property.
            /// </summary>
            /// <param name="value">PackageRoots</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder PackageRoots(ConfigNodePropertyString value)
            {
                _PackageRoots = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.PackageFilters property.
            /// </summary>
            /// <param name="value">PackageFilters</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder PackageFilters(ConfigNodePropertyArray value)
            {
                _PackageFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.PropertyFilters property.
            /// </summary>
            /// <param name="value">PropertyFilters</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder PropertyFilters(ConfigNodePropertyArray value)
            {
                _PropertyFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.TempFsFolder property.
            /// </summary>
            /// <param name="value">TempFsFolder</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder TempFsFolder(ConfigNodePropertyString value)
            {
                _TempFsFolder = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.UseBinaryReferences property.
            /// </summary>
            /// <param name="value">UseBinaryReferences</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder UseBinaryReferences(ConfigNodePropertyBoolean value)
            {
                _UseBinaryReferences = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.AutoSaveThreshold property.
            /// </summary>
            /// <param name="value">AutoSaveThreshold</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder AutoSaveThreshold(ConfigNodePropertyInteger value)
            {
                _AutoSaveThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.CleanupDelay property.
            /// </summary>
            /// <param name="value">CleanupDelay</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder CleanupDelay(ConfigNodePropertyInteger value)
            {
                _CleanupDelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.FileThreshold property.
            /// </summary>
            /// <param name="value">FileThreshold</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder FileThreshold(ConfigNodePropertyInteger value)
            {
                _FileThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.MEGA_BYTES property.
            /// </summary>
            /// <param name="value">MEGA_BYTES</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder MEGA_BYTES(ConfigNodePropertyDropDown value)
            {
                _MEGA_BYTES = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.UseOffHeapMemory property.
            /// </summary>
            /// <param name="value">UseOffHeapMemory</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder UseOffHeapMemory(ConfigNodePropertyBoolean value)
            {
                _UseOffHeapMemory = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.DigestAlgorithm property.
            /// </summary>
            /// <param name="value">DigestAlgorithm</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder DigestAlgorithm(ConfigNodePropertyDropDown value)
            {
                _DigestAlgorithm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.MonitoringQueueSize property.
            /// </summary>
            /// <param name="value">MonitoringQueueSize</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder MonitoringQueueSize(ConfigNodePropertyInteger value)
            {
                _MonitoringQueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.PathsMapping property.
            /// </summary>
            /// <param name="value">PathsMapping</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder PathsMapping(ConfigNodePropertyArray value)
            {
                _PathsMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.StrictImport property.
            /// </summary>
            /// <param name="value">StrictImport</param>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder StrictImport(ConfigNodePropertyBoolean value)
            {
                _StrictImport = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties</returns>
            public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(
                    Name: _Name,
                    Type: _Type,
                    ImportMode: _ImportMode,
                    AclHandling: _AclHandling,
                    PackageRoots: _PackageRoots,
                    PackageFilters: _PackageFilters,
                    PropertyFilters: _PropertyFilters,
                    TempFsFolder: _TempFsFolder,
                    UseBinaryReferences: _UseBinaryReferences,
                    AutoSaveThreshold: _AutoSaveThreshold,
                    CleanupDelay: _CleanupDelay,
                    FileThreshold: _FileThreshold,
                    MEGA_BYTES: _MEGA_BYTES,
                    UseOffHeapMemory: _UseOffHeapMemory,
                    DigestAlgorithm: _DigestAlgorithm,
                    MonitoringQueueSize: _MonitoringQueueSize,
                    PathsMapping: _PathsMapping,
                    StrictImport: _StrictImport
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}