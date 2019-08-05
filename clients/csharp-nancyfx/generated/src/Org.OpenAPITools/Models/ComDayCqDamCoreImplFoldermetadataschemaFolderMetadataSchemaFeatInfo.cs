using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo:  IEquatable<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo()
        {
        }

        private ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder</returns>
        public static ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder</returns>
        public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo left, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo left, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties _Properties;

            internal ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoBuilder Properties(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo</returns>
            public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}