using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo>
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
        public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo(string Pid, string Title, string Description, ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo left, ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo left, ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties _Properties;

            internal ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoBuilder Properties(ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo(
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