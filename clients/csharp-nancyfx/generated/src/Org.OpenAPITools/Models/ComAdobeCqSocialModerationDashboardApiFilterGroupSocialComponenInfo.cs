using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo:  IEquatable<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo>
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
        public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo()
        {
        }

        private ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo(string Pid, string Title, string Description, ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder</returns>
        public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo left, ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo left, ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties _Properties;

            internal ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoBuilder Properties(ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo</returns>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo(
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