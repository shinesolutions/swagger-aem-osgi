using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo:  IEquatable<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo>
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
        public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo()
        {
        }

        private ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder</returns>
        public static ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder</returns>
        public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo left, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo left, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties _Properties;

            internal ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoBuilder Properties(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo</returns>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo(
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