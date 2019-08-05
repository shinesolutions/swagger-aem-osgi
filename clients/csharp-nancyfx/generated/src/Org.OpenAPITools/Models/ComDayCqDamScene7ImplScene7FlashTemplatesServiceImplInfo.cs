using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo:  IEquatable<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo>
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
        public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo()
        {
        }

        private ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo(string Pid, string Title, string Description, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder</returns>
        public static ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder</returns>
        public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo left, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo left, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties _Properties;

            internal ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoBuilder Properties(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo</returns>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo(
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