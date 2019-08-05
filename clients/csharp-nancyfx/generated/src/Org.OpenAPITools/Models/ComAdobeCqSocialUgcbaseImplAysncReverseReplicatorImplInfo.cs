using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo:  IEquatable<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo>
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
        public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo left, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo left, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties _Properties;

            internal ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoBuilder Properties(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo</returns>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo(
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