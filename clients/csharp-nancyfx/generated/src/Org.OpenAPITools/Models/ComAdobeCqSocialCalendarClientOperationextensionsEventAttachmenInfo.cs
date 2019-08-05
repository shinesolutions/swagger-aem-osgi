using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo:  IEquatable<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo>
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
        public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo()
        {
        }

        private ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo(string Pid, string Title, string Description, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder</returns>
        public static ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder</returns>
        public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo left, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo left, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties _Properties;

            internal ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoBuilder Properties(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo</returns>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo(
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