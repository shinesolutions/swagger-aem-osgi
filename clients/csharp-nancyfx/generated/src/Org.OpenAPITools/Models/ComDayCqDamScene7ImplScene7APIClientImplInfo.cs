using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7APIClientImplInfo
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7APIClientImplInfo:  IEquatable<ComDayCqDamScene7ImplScene7APIClientImplInfo>
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
        public ComDayCqDamScene7ImplScene7APIClientImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7APIClientImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7APIClientImplInfo()
        {
        }

        private ComDayCqDamScene7ImplScene7APIClientImplInfo(string Pid, string Title, string Description, ComDayCqDamScene7ImplScene7APIClientImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7APIClientImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder</returns>
        public static ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder</returns>
        public ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamScene7ImplScene7APIClientImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7APIClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7APIClientImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7APIClientImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7APIClientImplInfo left, ComDayCqDamScene7ImplScene7APIClientImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7APIClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7APIClientImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7APIClientImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7APIClientImplInfo left, ComDayCqDamScene7ImplScene7APIClientImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7APIClientImplInfo.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamScene7ImplScene7APIClientImplProperties _Properties;

            internal ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7APIClientImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7APIClientImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7APIClientImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7APIClientImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamScene7ImplScene7APIClientImplInfoBuilder Properties(ComDayCqDamScene7ImplScene7APIClientImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7APIClientImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7APIClientImplInfo</returns>
            public ComDayCqDamScene7ImplScene7APIClientImplInfo Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7APIClientImplInfo(
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