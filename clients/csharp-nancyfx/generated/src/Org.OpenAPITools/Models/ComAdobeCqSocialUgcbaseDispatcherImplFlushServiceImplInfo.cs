using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo:  IEquatable<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo>
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
        public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo left, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo left, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties _Properties;

            internal ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoBuilder Properties(ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo</returns>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo(
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