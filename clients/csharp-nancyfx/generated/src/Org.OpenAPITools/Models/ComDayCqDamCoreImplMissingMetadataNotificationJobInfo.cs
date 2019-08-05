using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMissingMetadataNotificationJobInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplMissingMetadataNotificationJobInfo:  IEquatable<ComDayCqDamCoreImplMissingMetadataNotificationJobInfo>
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
        public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMissingMetadataNotificationJobInfo()
        {
        }

        private ComDayCqDamCoreImplMissingMetadataNotificationJobInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplMissingMetadataNotificationJobProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder</returns>
        public static ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder</returns>
        public ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplMissingMetadataNotificationJobInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo left, ComDayCqDamCoreImplMissingMetadataNotificationJobInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMissingMetadataNotificationJobInfo left, ComDayCqDamCoreImplMissingMetadataNotificationJobInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplMissingMetadataNotificationJobProperties _Properties;

            internal ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobInfoBuilder Properties(ComDayCqDamCoreImplMissingMetadataNotificationJobProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</returns>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMissingMetadataNotificationJobInfo(
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