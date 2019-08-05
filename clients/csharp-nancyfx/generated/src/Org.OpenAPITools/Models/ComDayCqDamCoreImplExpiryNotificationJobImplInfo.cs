using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplExpiryNotificationJobImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplExpiryNotificationJobImplInfo:  IEquatable<ComDayCqDamCoreImplExpiryNotificationJobImplInfo>
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
        public ComDayCqDamCoreImplExpiryNotificationJobImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplExpiryNotificationJobImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplExpiryNotificationJobImplInfo()
        {
        }

        private ComDayCqDamCoreImplExpiryNotificationJobImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplExpiryNotificationJobImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplExpiryNotificationJobImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder</returns>
        public ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplExpiryNotificationJobImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplExpiryNotificationJobImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplExpiryNotificationJobImplInfo left, ComDayCqDamCoreImplExpiryNotificationJobImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplExpiryNotificationJobImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplExpiryNotificationJobImplInfo left, ComDayCqDamCoreImplExpiryNotificationJobImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplExpiryNotificationJobImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplExpiryNotificationJobImplProperties _Properties;

            internal ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplInfoBuilder Properties(ComDayCqDamCoreImplExpiryNotificationJobImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplExpiryNotificationJobImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplExpiryNotificationJobImplInfo</returns>
            public ComDayCqDamCoreImplExpiryNotificationJobImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplExpiryNotificationJobImplInfo(
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