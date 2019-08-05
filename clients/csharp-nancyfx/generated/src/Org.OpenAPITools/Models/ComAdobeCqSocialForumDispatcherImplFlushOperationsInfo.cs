using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo
    /// </summary>
    public sealed class ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo:  IEquatable<ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo>
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
        public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo()
        {
        }

        private ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo(string Pid, string Title, string Description, ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder</returns>
        public static ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder Builder()
        {
            return new ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder</returns>
        public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo left, ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo left, ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties _Properties;

            internal ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfoBuilder Properties(ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo</returns>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo(
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