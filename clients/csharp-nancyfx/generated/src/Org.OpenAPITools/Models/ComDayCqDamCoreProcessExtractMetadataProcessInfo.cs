using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreProcessExtractMetadataProcessInfo
    /// </summary>
    public sealed class ComDayCqDamCoreProcessExtractMetadataProcessInfo:  IEquatable<ComDayCqDamCoreProcessExtractMetadataProcessInfo>
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
        public ComDayCqDamCoreProcessExtractMetadataProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreProcessExtractMetadataProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreProcessExtractMetadataProcessInfo()
        {
        }

        private ComDayCqDamCoreProcessExtractMetadataProcessInfo(string Pid, string Title, string Description, ComDayCqDamCoreProcessExtractMetadataProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreProcessExtractMetadataProcessInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder</returns>
        public static ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder Builder()
        {
            return new ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder</returns>
        public ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreProcessExtractMetadataProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreProcessExtractMetadataProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExtractMetadataProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExtractMetadataProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreProcessExtractMetadataProcessInfo left, ComDayCqDamCoreProcessExtractMetadataProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreProcessExtractMetadataProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExtractMetadataProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExtractMetadataProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreProcessExtractMetadataProcessInfo left, ComDayCqDamCoreProcessExtractMetadataProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreProcessExtractMetadataProcessInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreProcessExtractMetadataProcessProperties _Properties;

            internal ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExtractMetadataProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExtractMetadataProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExtractMetadataProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExtractMetadataProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreProcessExtractMetadataProcessInfoBuilder Properties(ComDayCqDamCoreProcessExtractMetadataProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreProcessExtractMetadataProcessInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreProcessExtractMetadataProcessInfo</returns>
            public ComDayCqDamCoreProcessExtractMetadataProcessInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreProcessExtractMetadataProcessInfo(
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