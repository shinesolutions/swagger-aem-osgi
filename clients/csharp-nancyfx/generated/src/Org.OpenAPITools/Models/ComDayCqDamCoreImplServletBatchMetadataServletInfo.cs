using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletBatchMetadataServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletBatchMetadataServletInfo:  IEquatable<ComDayCqDamCoreImplServletBatchMetadataServletInfo>
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
        public ComDayCqDamCoreImplServletBatchMetadataServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletBatchMetadataServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletBatchMetadataServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletBatchMetadataServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletBatchMetadataServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletBatchMetadataServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletBatchMetadataServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletBatchMetadataServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBatchMetadataServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBatchMetadataServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletBatchMetadataServletInfo left, ComDayCqDamCoreImplServletBatchMetadataServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletBatchMetadataServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBatchMetadataServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBatchMetadataServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletBatchMetadataServletInfo left, ComDayCqDamCoreImplServletBatchMetadataServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletBatchMetadataServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletBatchMetadataServletProperties _Properties;

            internal ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletInfoBuilder Properties(ComDayCqDamCoreImplServletBatchMetadataServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletBatchMetadataServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletBatchMetadataServletInfo</returns>
            public ComDayCqDamCoreImplServletBatchMetadataServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletBatchMetadataServletInfo(
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