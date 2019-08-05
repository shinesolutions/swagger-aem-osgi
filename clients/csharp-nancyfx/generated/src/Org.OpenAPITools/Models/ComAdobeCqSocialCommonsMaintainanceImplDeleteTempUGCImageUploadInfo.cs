using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo:  IEquatable<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo>
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
        public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo()
        {
        }

        private ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder</returns>
        public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo left, ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo left, ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties _Properties;

            internal ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoBuilder Properties(ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo</returns>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo(
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