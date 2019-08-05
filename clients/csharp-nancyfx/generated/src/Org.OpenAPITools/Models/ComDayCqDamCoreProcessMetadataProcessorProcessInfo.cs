using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreProcessMetadataProcessorProcessInfo
    /// </summary>
    public sealed class ComDayCqDamCoreProcessMetadataProcessorProcessInfo:  IEquatable<ComDayCqDamCoreProcessMetadataProcessorProcessInfo>
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
        public ComDayCqDamCoreProcessMetadataProcessorProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreProcessMetadataProcessorProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreProcessMetadataProcessorProcessInfo()
        {
        }

        private ComDayCqDamCoreProcessMetadataProcessorProcessInfo(string Pid, string Title, string Description, ComDayCqDamCoreProcessMetadataProcessorProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreProcessMetadataProcessorProcessInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder</returns>
        public static ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder Builder()
        {
            return new ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder</returns>
        public ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreProcessMetadataProcessorProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreProcessMetadataProcessorProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreProcessMetadataProcessorProcessInfo left, ComDayCqDamCoreProcessMetadataProcessorProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreProcessMetadataProcessorProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreProcessMetadataProcessorProcessInfo left, ComDayCqDamCoreProcessMetadataProcessorProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreProcessMetadataProcessorProcessInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreProcessMetadataProcessorProcessProperties _Properties;

            internal ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessInfoBuilder Properties(ComDayCqDamCoreProcessMetadataProcessorProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreProcessMetadataProcessorProcessInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreProcessMetadataProcessorProcessInfo</returns>
            public ComDayCqDamCoreProcessMetadataProcessorProcessInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreProcessMetadataProcessorProcessInfo(
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